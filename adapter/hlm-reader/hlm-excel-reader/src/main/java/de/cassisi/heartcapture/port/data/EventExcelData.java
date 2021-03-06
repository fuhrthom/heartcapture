package de.cassisi.heartcapture.port.data;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@ExcelSheet("Table#0")
public class EventExcelData implements ChronologicalData {

    @ExcelCellName("ZEIT")
    private LocalDateTime timestamp;

    @ExcelCellName("TEXT")
    private String text;

    @ExcelCellName("MENGE")
    private Integer amount;

    @ExcelCellName("EINHEIT")
    private String unit;

    @ExcelCellName("FAKTOR")
    private Integer factor;

    @ExcelCellName("MENGE_ML")
    private Integer amountMililiter;

    @ExcelCellName("FREI")
    private String free;

    @ExcelCellName("TYP")
    private String type;

}
