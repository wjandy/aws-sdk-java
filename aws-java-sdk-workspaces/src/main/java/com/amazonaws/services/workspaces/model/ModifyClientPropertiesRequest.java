/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyClientProperties" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyClientPropertiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The resource identifiers, in the form of directory IDs.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Information about the Amazon WorkSpaces client.
     * </p>
     */
    private ClientProperties clientProperties;

    /**
     * <p>
     * The resource identifiers, in the form of directory IDs.
     * </p>
     * 
     * @param resourceId
     *        The resource identifiers, in the form of directory IDs.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource identifiers, in the form of directory IDs.
     * </p>
     * 
     * @return The resource identifiers, in the form of directory IDs.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource identifiers, in the form of directory IDs.
     * </p>
     * 
     * @param resourceId
     *        The resource identifiers, in the form of directory IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClientPropertiesRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Information about the Amazon WorkSpaces client.
     * </p>
     * 
     * @param clientProperties
     *        Information about the Amazon WorkSpaces client.
     */

    public void setClientProperties(ClientProperties clientProperties) {
        this.clientProperties = clientProperties;
    }

    /**
     * <p>
     * Information about the Amazon WorkSpaces client.
     * </p>
     * 
     * @return Information about the Amazon WorkSpaces client.
     */

    public ClientProperties getClientProperties() {
        return this.clientProperties;
    }

    /**
     * <p>
     * Information about the Amazon WorkSpaces client.
     * </p>
     * 
     * @param clientProperties
     *        Information about the Amazon WorkSpaces client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClientPropertiesRequest withClientProperties(ClientProperties clientProperties) {
        setClientProperties(clientProperties);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getClientProperties() != null)
            sb.append("ClientProperties: ").append(getClientProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyClientPropertiesRequest == false)
            return false;
        ModifyClientPropertiesRequest other = (ModifyClientPropertiesRequest) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getClientProperties() == null ^ this.getClientProperties() == null)
            return false;
        if (other.getClientProperties() != null && other.getClientProperties().equals(this.getClientProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getClientProperties() == null) ? 0 : getClientProperties().hashCode());
        return hashCode;
    }

    @Override
    public ModifyClientPropertiesRequest clone() {
        return (ModifyClientPropertiesRequest) super.clone();
    }

}
