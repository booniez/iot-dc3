/*
 * Copyright 2016-present Pnoker All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *      https://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.pnoker.api.center.manager.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.pnoker.common.base.Converter;
import io.github.pnoker.common.bean.common.Pages;
import io.github.pnoker.common.model.Driver;
import lombok.*;
import org.springframework.beans.BeanUtils;

/**
 * Driver DTO
 *
 * @author pnoker
 * @since 2022.1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class DriverDto extends Driver implements Converter<Driver> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Pages page;

    @Override
    public void convertDtoToDo(Driver driver) {
        BeanUtils.copyProperties(this, driver);
    }

    @Override
    public void convertDoToDto(Driver driver) {
        BeanUtils.copyProperties(driver, this);
    }
}