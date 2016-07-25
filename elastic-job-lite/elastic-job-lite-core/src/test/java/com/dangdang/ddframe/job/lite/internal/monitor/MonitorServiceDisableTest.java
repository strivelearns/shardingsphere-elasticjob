/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.dangdang.ddframe.job.lite.internal.monitor;

import com.dangdang.ddframe.job.api.dataflow.DataflowType;
import com.dangdang.ddframe.job.lite.fixture.TestJob;
import com.dangdang.ddframe.job.lite.integrate.AbstractBaseStdJobTest;
import com.google.common.base.Optional;
import org.junit.Test;

import java.io.IOException;

public final class MonitorServiceDisableTest extends AbstractBaseStdJobTest {
    
    public MonitorServiceDisableTest() {
        super(TestJob.class, -1, Optional.<DataflowType>absent());
    }
    
    @Test(expected = IOException.class)
    public void assertMonitorWithDumpCommand() throws IOException {
        SocketUtils.sendCommand(MonitorService.DUMP_COMMAND, 9000);
    }
}