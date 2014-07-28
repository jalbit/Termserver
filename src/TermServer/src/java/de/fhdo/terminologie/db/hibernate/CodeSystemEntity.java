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
package de.fhdo.terminologie.db.hibernate;
// Generated 24.10.2011 10:08:21 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CodeSystemEntity generated by hbm2java
 */
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement
@XmlType(namespace="de.fhdo.termserver.types")
@Entity
@Table(name="code_system_entity"
    
)
public class CodeSystemEntity  implements java.io.Serializable {


     private Long id;
     private Long currentVersionId;
     private Set<CodeSystemVersionEntityMembership> codeSystemVersionEntityMemberships = new HashSet<CodeSystemVersionEntityMembership>(0);
     private Set<CodeSystemEntityVersion> codeSystemEntityVersions = new HashSet<CodeSystemEntityVersion>(0);

    public CodeSystemEntity() {
    }

    public CodeSystemEntity(Long currentVersionId, Set<CodeSystemVersionEntityMembership> codeSystemVersionEntityMemberships, Set<CodeSystemEntityVersion> codeSystemEntityVersions) {
       this.currentVersionId = currentVersionId;
       this.codeSystemVersionEntityMemberships = codeSystemVersionEntityMemberships;
       this.codeSystemEntityVersions = codeSystemEntityVersions;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    @Column(name="currentVersionId")
    public Long getCurrentVersionId() {
        return this.currentVersionId;
    }
    
    public void setCurrentVersionId(Long currentVersionId) {
        this.currentVersionId = currentVersionId;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="codeSystemEntity")
    public Set<CodeSystemVersionEntityMembership> getCodeSystemVersionEntityMemberships() {
        return this.codeSystemVersionEntityMemberships;
    }
    
    public void setCodeSystemVersionEntityMemberships(Set<CodeSystemVersionEntityMembership> codeSystemVersionEntityMemberships) {
        this.codeSystemVersionEntityMemberships = codeSystemVersionEntityMemberships;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="codeSystemEntity")
    public Set<CodeSystemEntityVersion> getCodeSystemEntityVersions() {
        return this.codeSystemEntityVersions;
    }
    
    public void setCodeSystemEntityVersions(Set<CodeSystemEntityVersion> codeSystemEntityVersions) {
        this.codeSystemEntityVersions = codeSystemEntityVersions;
    }




}

