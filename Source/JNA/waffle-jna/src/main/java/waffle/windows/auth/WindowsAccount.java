/**
 * Waffle (https://github.com/dblock/waffle)
 *
 * Copyright (c) 2010 - 2015 Application Security, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Application Security, Inc.
 */
package waffle.windows.auth;

import java.io.Serializable;

/**
 * A flattened Windows Account used in a Windows principal.
 * 
 * @author dblock[at]dblock[dot]org
 */
public class WindowsAccount implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    
    /** The sid string. */
    private String            sidString;
    
    /** The fqn. */
    private String            fqn;
    
    /** The name. */
    private String            name;
    
    /** The domain. */
    private String            domain;

    /**
     * Instantiates a new windows account.
     *
     * @param account
     *            the account
     */
    public WindowsAccount(final IWindowsAccount account) {
        this.sidString = account.getSidString();
        this.fqn = account.getFqn();
        this.name = account.getName();
        this.domain = account.getDomain();
    }

    /**
     * Gets the sid string.
     *
     * @return the sid string
     */
    public String getSidString() {
        return this.sidString;
    }

    /**
     * Gets the fqn.
     *
     * @return the fqn
     */
    public String getFqn() {
        return this.fqn;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the domain.
     *
     * @return the domain
     */
    public String getDomain() {
        return this.domain;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object o) {

        if (this == o) {
            return true;
        }

        if (!(o instanceof WindowsAccount)) {
            return false;
        }

        return ((WindowsAccount) o).getSidString().equals(getSidString());
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return getSidString().hashCode();
    }
}
