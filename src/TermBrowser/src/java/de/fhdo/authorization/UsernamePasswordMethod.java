/* 
 * CTS2 based Terminology Server and Terminology Browser
 * Copyright (C) 2014 FH Dortmund: Peter Haas, Robert Muetzner
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.fhdo.authorization;

import de.fhdo.gui.admin.Login;
import de.fhdo.helper.SessionHelper;
import de.fhdo.helper.WebServiceHelper;
import de.fhdo.logging.LoggingOutput;
import de.fhdo.terminologie.ws.authorization.LogoutResponseType;
import de.fhdo.terminologie.ws.authorization.Status;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.SuspendNotAllowedException;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Window;

/**
 *
 * @author Robert Mützner <robert.muetzner@fh-dortmund.de>
 */
public class UsernamePasswordMethod implements IAuthorization
{
  private static org.apache.log4j.Logger logger = de.fhdo.logging.Logger4j.getInstance().getLogger();

  public boolean doLogin()
  {
    logger.debug("[UsernamePasswordMethod] doLogin()");
    
    // open login window
    try
    {
      Window win = (Window) Executions.createComponents("/gui/admin/login.zul", null, null);
      win.doModal();

      if (((Login) win).isErfolg())
      {
        return true;
      }
    }
    catch (SuspendNotAllowedException ex)
    {
      LoggingOutput.outputException(ex, this);
    }
    return false;
  }

  public boolean doLogout()
  {
    logger.debug("[UsernamePasswordMethod] doLogout()");
    
    // Webservice aufrufen
    logger.debug("Authorization.logout()-Webservice wird aufgerufen");
    
    
    // Generische Parameterliste füllen (hier nur SessionID)
    List<String> parameterList = new LinkedList<String>();
    parameterList.add(SessionHelper.getSessionId());
    
    LogoutResponseType response = WebServiceHelper.logout(parameterList);
    logger.debug("Antwort: " + response.getReturnInfos().getMessage());

    if (response.getReturnInfos().getStatus() == Status.OK)
    {
      SessionHelper.reset();

      return true;
    }
    else
    {
      try
      {
        Messagebox.show(Labels.getLabel("loginHelper.loggingOffError") + ": " + response.getReturnInfos().getMessage());
      }
      catch (Exception ex)
      {
        LoggingOutput.outputException(ex, this);
      }
    }
    return false;
  }

  
}
