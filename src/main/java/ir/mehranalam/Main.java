/*
 * Copyright (C) 2022 Mehranalam, Inc.
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
 *
 * Version 1.0.0
 */


package ir.mehranalam;

import ir.mehranalam.cURL.Templates.Commands;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("I,am HTTP Communication");

        Commands test = new Commands();
        test.GET_METHOD_CURL_BASE(test
                .RUN_COMMAND_CURL_BASE("curl -X GET https://saurav.tech/NewsAPI/sources.json"));

        System.out.println(test.STORE_DATA.get(0));
    }
}