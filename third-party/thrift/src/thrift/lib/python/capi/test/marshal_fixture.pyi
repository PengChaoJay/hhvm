# Copyright (c) Meta Platforms, Inc. and affiliates.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

def roundtrip_int32(x: object) -> object: ...
def roundtrip_int64(x: object) -> object: ...
def roundtrip_uint32(x: object) -> object: ...
def roundtrip_uint64(x: object) -> object: ...
def roundtrip_float(x: object) -> object: ...
def roundtrip_double(x: object) -> object: ...
def roundtrip_bool(x: object) -> object: ...
def roundtrip_bytes(x: object) -> object: ...
def roundtrip_unicode(x: object) -> object: ...
def roundtrip_bytes(x: object) -> object: ...
def roundtrip_unicode(x: object) -> object: ...
def make_unicode(bytes: object) -> object: ...
def roundtrip_int32_list(x: object) -> object: ...
def roundtrip_bool_list(x: object) -> object: ...
def roundtrip_double_list(x: object) -> object: ...
def roundtrip_bytes_list(x: object) -> object: ...
def roundtrip_unicode_list(x: object) -> object: ...
def make_unicode_list(bytes: object) -> object: ...
def roundtrip_int32_set(x: object) -> object: ...
def roundtrip_bool_set(x: object) -> object: ...
def roundtrip_double_set(x: object) -> object: ...
def roundtrip_bytes_set(x: object) -> object: ...
def roundtrip_unicode_set(x: object) -> object: ...
def make_unicode_set(bytes: object) -> object: ...
def roundtrip_int32_bool_map(x: object) -> object: ...
def roundtrip_byte_float_map(x: object) -> object: ...
def roundtrip_bytes_key_map(x: object) -> object: ...
def roundtrip_unicode_key_map(x: object) -> object: ...
def roundtrip_bytes_val_map(x: object) -> object: ...
def roundtrip_unicode_val_map(x: object) -> object: ...
def make_unicode_val_map(x: object) -> object: ...

INT8_MIN: int
INT8_MAX: int
INT32_MIN: int
INT32_MAX: int
UINT32_MAX: int
INT64_MIN: int
INT64_MAX: int
UINT64_MAX: int
