/*
 * Tencent is pleased to support the open source community by making TubeMQ available.
 *
 * Copyright (C) 2012-2019 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * https://opensource.org/licenses/Apache-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.tencent.tubemq.server.common.exception;

public class HeartbeatException extends Exception {

    private static final long serialVersionUID = 797480309212586895L;

    public HeartbeatException() {
        super();
    }

    public HeartbeatException(String message) {
        super(message);
    }

    public HeartbeatException(String message, Throwable cause) {
        super(message, cause);
    }

    public HeartbeatException(Throwable cause) {
        super(cause);
    }
}
