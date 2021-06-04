
package api;

import javax.annotation.processing.Generated;
import io.cucumber.messages.internal.com.google.gson.annotations.Expose;
import io.cucumber.messages.internal.com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Hour {

    @Expose
    private Long cloudness;
    @Expose
    private String condition;
    @SerializedName("feels_like")
    private Long feelsLike;
    @Expose
    private String hour;
    @SerializedName("hour_ts")
    private Long hourTs;
    @Expose
    private Long humidity;
    @Expose
    private String icon;
    @SerializedName("is_thunder")
    private Boolean isThunder;
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
    @Expose
    private Long temp;
    @SerializedName("uv_index")
    private Long uvIndex;
    @SerializedName("wind_dir")
    private String windDir;
    @SerializedName("wind_gust")
    private Double windGust;
    @SerializedName("wind_speed")
    private Double windSpeed;
}
