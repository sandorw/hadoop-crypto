/*
 * Copyright 2017 Palantir Technologies, Inc. All rights reserved.
 *
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
 */

package com.palantir.crypto2.io;

import com.palantir.seekio.SeekableInput;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public final class ByteArraySeekableInput extends ByteArrayInputStream implements SeekableInput {

    public ByteArraySeekableInput(byte[] bytes) {
        super(bytes);
    }

    @Override
    public void seek(long offset) throws IOException {
        super.reset();
        super.skip(offset);
    }

    @Override
    public long getPos() throws IOException {
        return super.pos;
    }

    @Override
    public int read(byte[] bytes, int offset, int length) {
        return super.read(bytes, offset, length);
    }

    @Override
    public void close() throws IOException {
        super.close();
    }

}
