package de.cassisi.heartcapture.port.data;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ExcelSheet("Table#2")
public class MachineExcelData {

    @ExcelCellName("OXYGENATOR")
    private String oxygenator;

    @ExcelCellName("HAEMO_FIL")
    private String haemoFilter;

    @ExcelCellName("KANUEL_ART")
    private String kanuelArt;

    @ExcelCellName("KANUEL_VEN")
    private String kanuelVen;

    @ExcelCellName("KANUEL_VEN2")
    private String kanuelVen2;

}
