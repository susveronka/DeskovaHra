import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class HraTableModel extends AbstractTableModel {
    private List<Hra> data = new ArrayList<>();    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
Hra hraNaRadku = data.get(rowIndex);

}
}