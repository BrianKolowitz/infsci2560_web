/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.infsci2560.samples.beans.weather.sax;
/*
<current>
    <city id="2053426" name="Xidianzi">
        <coord lon="120" lat="40"/>
        <country>CN</country>
        <sun rise="2014-11-01T22:30:19" set="2014-11-02T08:56:48"/>
    </city>
    <temperature value="273.392" min="273.392" max="273.392" unit="kelvin"/>
    <humidity value="71" unit="%"/>
    <pressure value="1018.4" unit="hPa"/>
    <wind>
        <speed value="2.83" name="Light breeze"/>
        <direction value="263.01" code="W" name="West"/>
    </wind>
    <clouds value="0" name="clear sky"/>
    <visibility/>
    <precipitation mode="no"/>
    <weather number="800" value="Sky is Clear" icon="01n"/>
    <lastupdate value="2014-11-02T18:46:47"/>
</current>
*/

/**
 *
 * @author kolowitzbj
 */
public class Current {

    private City city;
    private Temperature temperature;
    private Humidity humidity;
    private Pressure pressure;
    private Wind wind;
    private Clouds clouds;
    private Visibility visibility;
    private Precipitation precipitation;
    private Weather weather;
    
    public Current() {
        
    }

    /**
     * @return the city
     */
    public City getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(City city) {
        this.city = city;
    }

    /**
     * @return the temperature
     */
    public Temperature getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    /**
     * @return the humidity
     */
    public Humidity getHumidity() {
        return humidity;
    }

    /**
     * @param humidity the humidity to set
     */
    public void setHumidity(Humidity humidity) {
        this.humidity = humidity;
    }

    /**
     * @return the pressure
     */
    public Pressure getPressure() {
        return pressure;
    }

    /**
     * @param pressure the pressure to set
     */
    public void setPressure(Pressure pressure) {
        this.pressure = pressure;
    }

    /**
     * @return the wind
     */
    public Wind getWind() {
        return wind;
    }

    /**
     * @param wind the wind to set
     */
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    /**
     * @return the clouds
     */
    public Clouds getClouds() {
        return clouds;
    }

    /**
     * @param clouds the clouds to set
     */
    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    /**
     * @return the visibility
     */
    public Visibility getVisibility() {
        return visibility;
    }

    /**
     * @param visibility the visibility to set
     */
    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    /**
     * @return the precipitation
     */
    public Precipitation getPrecipitation() {
        return precipitation;
    }

    /**
     * @param precipitation the precipitation to set
     */
    public void setPrecipitation(Precipitation precipitation) {
        this.precipitation = precipitation;
    }

    /**
     * @return the weather
     */
    public Weather getWeather() {
        return weather;
    }

    /**
     * @param weather the weather to set
     */
    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public class City {

        private String id;
        private String name;
        private Coord coord;
        private String country;
        private Sun sun;

        /**
         * @return the id
         */
        public String getId() {
            return id;
        }

        /**
         * @param id the id to set
         */
        public void setId(String id) {
            this.id = id;
        }

        /**
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name the name to set
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * @return the coord
         */
        public Coord getCoord() {
            return coord;
        }

        /**
         * @param coord the coord to set
         */
        public void setCoord(Coord coord) {
            this.coord = coord;
        }

        /**
         * @return the country
         */
        public String getCountry() {
            return country;
        }

        /**
         * @param country the country to set
         */
        public void setCountry(String country) {
            this.country = country;
        }

        /**
         * @return the sun
         */
        public Sun getSun() {
            return sun;
        }

        /**
         * @param sun the sun to set
         */
        public void setSun(Sun sun) {
            this.sun = sun;
        }

        public class Coord {

            private String lon;
            private String lat;

            /**
             * @return the lon
             */
            public String getLon() {
                return lon;
            }

            /**
             * @param lon the lon to set
             */
            public void setLon(String lon) {
                this.lon = lon;
            }

            /**
             * @return the lat
             */
            public String getLat() {
                return lat;
            }

            /**
             * @param lat the lat to set
             */
            public void setLat(String lat) {
                this.lat = lat;
            }
        }

        public class Sun {

            private String rise;
            private String set;

            /**
             * @return the rise
             */
            public String getRise() {
                return rise;
            }

            /**
             * @param rise the rise to set
             */
            public void setRise(String rise) {
                this.rise = rise;
            }

            /**
             * @return the set
             */
            public String getSet() {
                return set;
            }

            /**
             * @param set the set to set
             */
            public void setSet(String set) {
                this.set = set;
            }
        }

    }

    public class Temperature {

        private String value;
        private String min;
        private String max;
        private String unit;

        /**
         * @return the value
         */
        public String getValue() {
            return value;
        }

        /**
         * @param value the value to set
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * @return the min
         */
        public String getMin() {
            return min;
        }

        /**
         * @param min the min to set
         */
        public void setMin(String min) {
            this.min = min;
        }

        /**
         * @return the max
         */
        public String getMax() {
            return max;
        }

        /**
         * @param max the max to set
         */
        public void setMax(String max) {
            this.max = max;
        }

        /**
         * @return the unit
         */
        public String getUnit() {
            return unit;
        }

        /**
         * @param unit the unit to set
         */
        public void setUnit(String unit) {
            this.unit = unit;
        }
    }

    public class Humidity {

        private String value;
        private String unit;
    }

    public class Pressure {

        private String value;
        private String unit;
    }

    public class Wind {

        public class Speed {

            private String value;
            private String name;

        }

        public class Direction {

            private String value;
            private String code;
            private String Name;
        }
    }

    public class Clouds {

        private String value;
        private String name;
    }

    public class Visibility {

    }

    public class Precipitation {

        private String mode;
    }

    public class Weather {

        private String number;
        private String value;
        private String icon;
    }

    public class LastUpdate {

        private String value;
    }

}
