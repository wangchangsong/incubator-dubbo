/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.dubbo.test.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.demo.DemoService;

import java.net.URL;

/**
 * Default {@link DemoService} implementation
 *
 * @since 2.5.8
 */
@Service(
        version = "2.5.8",
        application = "dubbo-annotation-provider",
        protocol = "dubbo",
        registry = "my-registry"
)
public class DefaultDemoService implements DemoService {

    @Override
    public String sayHello(String name) {
        return "DefaultDemoService - sayHell() : " + name;
    }

    @Override
    public void getHello(String name) {

    }

    @Override
    public URL getURL(String url) {
        return null;
    }

}
