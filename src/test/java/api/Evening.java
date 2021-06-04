
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
public class Evening {

    @Expose
    private String _source;
    @Expose
    private Long cloudness;
    @Expose
    private String condition;
    @Expose
    private String daytime;
    @SerializedName("feels_like")
    private Long feelsLike;
    @Expose
    private Long humidity;
    @Expose
    private String icon;
    @Expose
    private Boolean polar;
    @SerializedName("prec_mm")
    private Long precMm;
    @SerializedName("prec_period")
    private Long precPeriod;
    @SerializedName("prec_prob")
    private Long precProb;
    @SerializedName("prec_strength")
    private Long precStrength;
    @SerializedName("prec_type")
    private Long precType;
    @SerializedName("pressure_mm")
    private Long pressureMm;
    @SerializedName("pressure_pa")
    private Long pressurePa;
    @SerializedName("soil_moisture")
    private Double soilMoisture;
    @SerializedName("soil_temp")
    private Long soilTemp;
    @SerializedName("temp_avg")
    private Long tempAvg;
    @SerializedName("temp_max")
    private Long tempMax;
    @SerializedName("temp_min")
    private Long tempMin;
    @SerializedName("uv_index")
    private Long uvIndex;
    @SerializedName("wind_dir")
    private String windDir;
    @SerializedName("wind_gust")
    private Double windGust;
    @SerializedName("wind_speed")
    private Long windSpeed;
}
