/*
 * $Id: PropertyDescription.java,v 1.1 2005/10/03 18:24:19 thomas Exp $
 * Created on Sep 29, 2005
 *
 * Copyright (C) 2005 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 * 
 */

package com.idega.repository.data;

/**
 * PropertyDescription keeps the link between a ResourceDescription and a certain method.
 * 
 * @see PresentationObject#getPropertyDescriptions()
 */
public class PropertyDescription {
	
	private String name = null;
	private String parameterId = null;
	private ResourceDescription resourceDescription = null;
	
	public PropertyDescription(String name, String parameterId, ResourceDescription resourceDescription) {
		this.name = name;
		this.parameterId = parameterId;
		this.resourceDescription = resourceDescription;
		
	}
	
	public PropertyDescription(String name, String parameterId, String source, String provider, boolean isEjb) {
		this(name, parameterId, new ResourceDescription(source, provider, isEjb));

	}

	
	public String getName() {
		return name;
	}

	
	public String getParameterId() {
		return parameterId;
	}

	
	public ResourceDescription getResourceDescription() {
		return resourceDescription;
	}
	
	
}