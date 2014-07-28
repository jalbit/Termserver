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
package de.fhdo.collaboration.db.classes;
// Generated 15.05.2013 18:02:38 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Domain generated by hbm2java
 */
@Entity
@Table(name="domain"
    
)
public class Domain  implements java.io.Serializable {


     private Long id;
     private DomainValue domainValueByDefaultValueId;
     private DomainValue domainValueByDisplayOrder;
     private String name;
     private String displayText;
     private String domainOid;
     private String domainCodesys;
     private String description;
     private String domainType;
     private Set<ClassAttribute> classAttributes = new HashSet<ClassAttribute>(0);
     private Set<DomainValue> domainValues = new HashSet<DomainValue>(0);

    public Domain() {
    }

	
    public Domain(String name) {
        this.name = name;
    }
    public Domain(DomainValue domainValueByDefaultValueId, DomainValue domainValueByDisplayOrder, String name, String displayText, String domainOid, String domainCodesys, String description, String domainType, Set<ClassAttribute> classAttributes, Set<DomainValue> domainValues) {
       this.domainValueByDefaultValueId = domainValueByDefaultValueId;
       this.domainValueByDisplayOrder = domainValueByDisplayOrder;
       this.name = name;
       this.displayText = displayText;
       this.domainOid = domainOid;
       this.domainCodesys = domainCodesys;
       this.description = description;
       this.domainType = domainType;
       this.classAttributes = classAttributes;
       this.domainValues = domainValues;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="default_value_id")
    public DomainValue getDomainValueByDefaultValueId() {
        return this.domainValueByDefaultValueId;
    }
    
    public void setDomainValueByDefaultValueId(DomainValue domainValueByDefaultValueId) {
        this.domainValueByDefaultValueId = domainValueByDefaultValueId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="display_order")
    public DomainValue getDomainValueByDisplayOrder() {
        return this.domainValueByDisplayOrder;
    }
    
    public void setDomainValueByDisplayOrder(DomainValue domainValueByDisplayOrder) {
        this.domainValueByDisplayOrder = domainValueByDisplayOrder;
    }
    
    @Column(name="name", nullable=false, length=60)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="display_text", length=65535)
    public String getDisplayText() {
        return this.displayText;
    }
    
    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }
    
    @Column(name="domain_oid", length=100)
    public String getDomainOid() {
        return this.domainOid;
    }
    
    public void setDomainOid(String domainOid) {
        this.domainOid = domainOid;
    }
    
    @Column(name="domain_codesys", length=100)
    public String getDomainCodesys() {
        return this.domainCodesys;
    }
    
    public void setDomainCodesys(String domainCodesys) {
        this.domainCodesys = domainCodesys;
    }
    
    @Column(name="description", length=65535)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Column(name="domain_type", length=50)
    public String getDomainType() {
        return this.domainType;
    }
    
    public void setDomainType(String domainType) {
        this.domainType = domainType;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="domain")
    public Set<ClassAttribute> getClassAttributes() {
        return this.classAttributes;
    }
    
    public void setClassAttributes(Set<ClassAttribute> classAttributes) {
        this.classAttributes = classAttributes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="domain")
    public Set<DomainValue> getDomainValues() {
        return this.domainValues;
    }
    
    public void setDomainValues(Set<DomainValue> domainValues) {
        this.domainValues = domainValues;
    }




}


