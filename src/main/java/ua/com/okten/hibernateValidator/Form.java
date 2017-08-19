package ua.com.okten.hibernateValidator;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

public class Form {
    @Size(min = 2,max = 12,message = "you name should be betwen 2- 12 characters")
    private String name;

    @Pattern(regexp = ".+@.+\\\\..+",message = "wrong email")
    private String email;

    @Min(value = 2,message = "please insert name")
    private String lastName;

    //    @NotNull
//    @NotEmpty
    @NotBlank
    @Length(min = 4,max = 15)
    private String password;

    @DateTimeFormat(pattern = "DD/MM/YYYY")
    private Date date;


}
