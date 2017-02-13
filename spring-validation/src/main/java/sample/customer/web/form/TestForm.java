package sample.customer.web.form;

import java.io.Serializable;



import javax.validation.constraints.Pattern;


import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class TestForm implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotEmpty
    @Length(max=5)
    @Pattern(regexp = "^[a-zA-Z0-9]*$")
    private String name;
    
    public String getName(){
    	return this.name;
    }
    public void setName(String name){
    	this.name = name;
    }
    

}