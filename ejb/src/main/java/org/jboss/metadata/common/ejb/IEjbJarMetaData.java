/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2013, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.metadata.common.ejb;

import org.jboss.metadata.ejb.spec.InterceptorsMetaData;
import org.jboss.metadata.ejb.spec.RelationsMetaData;

/**
 * @author Scott.Stark@jboss.org
 * @version $Revision: 66487 $
 */
public interface IEjbJarMetaData<A extends IAssemblyDescriptorMetaData,
        C extends IEnterpriseBeansMetaData<A, C, E, J>,
        E extends IEnterpriseBeanMetaData<A, C, E, J>,
        J extends IEjbJarMetaData<A, C, E, J>> {
    String getVersion();

    void setVersion(String version);

    boolean isEJB1x();

    boolean isEJB2x();

    boolean isEJB21();

    boolean isEJB3x();

    String getEjbClientJar();

    void setEjbClientJar(String ejbClientJar);

    C getEnterpriseBeans();

    E getEnterpriseBean(String name);

    void setEnterpriseBeans(C enterpriseBeans);

    RelationsMetaData getRelationships();

    void setRelationships(RelationsMetaData relationships);

    A getAssemblyDescriptor();

    void setAssemblyDescriptor(A assemblyDescriptor);

    InterceptorsMetaData getInterceptors();
}
