
package api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.cucumber.messages.internal.com.google.gson.annotations.Expose;
import io.cucumber.messages.internal.com.google.gson.annotations.SerializedName;
import lombok.*;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Parts {

    @Expose
    private Day day;
    @SerializedName("day_short")
    private DayShort dayShort;
    @Expose
    private Evening evening;
    @Expose
    private Morning morning;
    @Expose
    private Night night;
    @SerializedName("night_short")
    private NightShort nightShort;
}
