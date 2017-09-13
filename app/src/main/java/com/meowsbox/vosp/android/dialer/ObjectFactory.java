/*
 * Copyright (c) 2017. Darryl Hon
 * Modifications Copyright (c) 2017. Darryl Hon
 *
 * This file is part of VOSP and may be covered under one or more licenses.
 * Refer to the project LICENSE and NOTICE files for details.
 */

/*
 * Copyright (C) 2013 The Android Open Source Project
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
 * limitations under the License
 */

package com.meowsbox.vosp.android.dialer;

import android.app.DialogFragment;
import android.content.Context;

import com.meowsbox.vosp.android.dialer.service.CachedNumberLookupService;

//import com.android.dialer.calllog.CallLogAdapter;
//import com.android.dialer.calllog.CallLogAdapter.CallItemExpandedListener;
//import com.android.dialer.calllog.CallLogAdapter.OnReportButtonClickListener;
//import com.android.dialer.calllog.ContactInfoHelper;
//import com.android.dialer.service.CachedNumberLookupService;
//
//import static com.android.dialer.calllog.CallLogAdapter.CallFetcher;

import static com.meowsbox.vosp.android.dialer.callog.CallLogAdapter.CallFetcher;
import com.meowsbox.vosp.android.dialer.callog.CallLogAdapter;
import com.meowsbox.vosp.android.dialer.callog.CallLogAdapter.CallItemExpandedListener;
import com.meowsbox.vosp.android.dialer.callog.CallLogAdapter.OnReportButtonClickListener;
import com.meowsbox.vosp.android.dialer.callog.ContactInfoHelper;

/**
 * Default static binding for various objects.
 */
public class ObjectFactory {

    public static CachedNumberLookupService newCachedNumberLookupService() {
        // no-op
        return null;
    }

    /**
     * Create a new instance of the call log adapter.
     * @param context The context to use.
     * @param callFetcher Instance of call fetcher to use.
     * @param contactInfoHelper Instance of contact info helper class to use.
     * @param isCallLog Is this call log adapter being used on the call log?
     * @return Instance of CallLogAdapter.
     */
    public static CallLogAdapter newCallLogAdapter(Context context,
            CallFetcher callFetcher, ContactInfoHelper contactInfoHelper,
            CallItemExpandedListener callItemExpandedListener,
            OnReportButtonClickListener onReportButtonClickListener, boolean isCallLog) {
        return new CallLogAdapter(context, callFetcher, contactInfoHelper,
                callItemExpandedListener, onReportButtonClickListener, isCallLog);
    }

    public static DialogFragment getReportDialogFragment(String number) {
        return null;
    }
}
