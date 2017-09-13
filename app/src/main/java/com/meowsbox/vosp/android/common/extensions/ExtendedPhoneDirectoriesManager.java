/*
 * Copyright (c) 2017. Darryl Hon
 * Modifications Copyright (c) 2017. Darryl Hon
 *
 * This file is part of VOSP and may be covered under one or more licenses.
 * Refer to the project LICENSE and NOTICE files for details.
 */

// Copyright 2013 Google Inc. All Rights Reserved.

package com.meowsbox.vosp.android.common.extensions;

import android.content.Context;

//import com.android.contacts.common.list.DirectoryPartition;

import com.meowsbox.vosp.android.dialer.list.DirectoryPartition;

import java.util.List;

/**
 * An interface for adding extended phone directories to
 * {@link com.android.contacts.common.list.PhoneNumberListAdapter}.
 * An app that wishes to add custom phone directories should implement this class and advertise it
 * in assets/contacts_extensions.properties. {@link ExtensionsFactory} will load the implementation
 * and the extended directories will be added by
 * {@link com.android.contacts.common.list.PhoneNumberListAdapter}.
 */
public interface ExtendedPhoneDirectoriesManager {

    /**
     * Return a list of extended directories to add. May return null if no directories are to be
     * added.
     */
    List<DirectoryPartition> getExtendedDirectories(Context context);
}
