
package api;

import java.util.List;

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
public class YandexForecasts {

    @Expose
    private Biomet biomet;
    @Expose
    private String date;
    @SerializedName("date_ts")
    private Long dateTs;
    @Expose
    private List<Hour> hours;
    @SerializedName("moon_code")
    private Long moonCode;
    @SerializedName("moon_text")
    private String moonText;
    @Expose
    private Parts parts;
    @SerializedName("rise_begin")
    private String riseBegin;
    @SerializedName("set_end")
    private String setEnd;
    @Expose
    private String sunrise;
    @Expose
    private String sunset;
    @Expose
    private Long week;
}
