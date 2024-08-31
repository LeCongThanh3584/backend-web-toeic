package com.backend.spring.payload.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfileRequest {
    @NotNull(message = "Id người dùng phải có giá trị!")
    private Integer userId;

    @NotBlank(message = "Địa chỉ không được bỏ trống!")
    private String address;

    @NotBlank(message = "Số điện thoại không được bỏ trống!")
    @Size(max = 10,message = "Số điện thoại tối đa 10 ký tự!")
    private String phoneNumber;

    @NotNull(message = "Giới tính không được bỏ trống!")
    private Integer gender;

    @NotBlank(message = "Tên người dùng không được bỏ trống!")
    private String fullName;
}
