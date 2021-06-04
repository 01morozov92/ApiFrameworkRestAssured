
package api;


import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.cucumber.messages.internal.com.google.gson.annotations.Expose;
import lombok.*;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Biomet {

    @Expose
    private String condition;
    @Expose
    private Long index;
}
