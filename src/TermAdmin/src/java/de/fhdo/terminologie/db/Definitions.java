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
package de.fhdo.terminologie.db;

/**
 *
 * @author Robert Mützner
 */
public class Definitions
{
  // Benötigte Domains
  public final static long DOMAINID_ISO_639_1_LANGUACECODES = 1;
  public final static long DOMAINID_VALIDITYDOMAIN = 2;
  public final static long DOMAINID_DISPLAY_ORDER = 3;
  public final static long DOMAINID_IMPORT_FORMATS_CS = 4;
  public final static long DOMAINID_EXPORT_FORMATS = 5;
  public final static long DOMAINID_CODESYSTEM_TYPES = 6;
  public final static long DOMAINID_METADATAPARAMETER_TYPES = 7;
  public final static long DOMAINID_CODESYSTEM_TAXONOMY = 8;
  public final static long DOMAINID_VALUESET_VALIDITYRANGE = 9;
  public final static long DOMAINID_IMPORT_FORMATS_VS = 12;
  public static final long STATUS_CONCEPT_VISIBILITY = 13;
  public static final long STATUS_CONCEPT_DEACTIVATED = 14;
  public static final long STATUS = 15;
  
  
  public final static String TECHNICAL_TYPE_PARAMETRIERUNG = "param";
  public final static String TECHNICAL_TYPE_MENU = "menu";
  public final static String TECHNICAL_TYPE_SUBMENU = "submenu";
  public final static String TECHNICAL_TYPE_TOOLMENU = "toolmenu";

  public final static long DISPLAYORDER_ID = 185;
  public final static long DISPLAYORDER_ORDERID = 186;
  public final static long DISPLAYORDER_NAME = 187;
  
  public final static String APP_KEY = "TERMSERVER";
  
  
  /*public final static long TECHNICALTYPE_DOCUMENT = 2196;
  public final static long TECHNICALTYPE_LINK = 2197;
  public final static long TECHNICALTYPE_NOTE = 2198;*/
  
  

  //public final static String TODO_ANWENDUNG_ADRESS = "http://www.ebpg.mi.fh-dortmund.de:8080/toDO/";
  //public final static String TODO_ANWENDUNG_ADRESS = "http://193.25.22.68:8080/toDO/";
  
  
}
