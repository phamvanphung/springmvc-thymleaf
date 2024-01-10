package vn.kienlongbank.spirngmvcthemleaf.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class SeedStarter {

    private Integer id = null;
    private Date datePlanted = null;
    private Boolean covered = null;
    private Type type = Type.PLASTIC;
    private Feature[] features = null;

    private List<Row> rows = new ArrayList<>();


    public SeedStarter() {
        super();
    }


    public Integer getId() {
        return this.id;
    }



    public Date getDatePlanted() {
        return this.datePlanted;
    }




    public Boolean getCovered() {
        return this.covered;
    }




    public Type getType() {
        return this.type;
    }




    public Feature[] getFeatures() {
        return this.features;
    }



    public List<Row> getRows() {
        return this.rows;
    }


    @Override
    public String toString() {
        return "SeedStarter [id=" + this.id + ", datePlanted=" + this.datePlanted
            + ", covered=" + this.covered + ", type=" + this.type + ", features="
            + Arrays.toString(this.features) + ", rows=" + this.rows + "]";
    }
}
