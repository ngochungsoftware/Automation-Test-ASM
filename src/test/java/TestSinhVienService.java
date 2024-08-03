import com.example.entity.SinhVien;
import com.example.service.SinhVienService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestSinhVienService {

    @Test
    public void testSinhVienService() {
        SinhVienService service = new SinhVienService();

        SinhVien sv = service.createSinhVien("1", "Nguyen Van A", "K64", "CNTT", "123456");
        assertEquals("1", sv.getId());
        assertEquals("Nguyen Van A", sv.getHoten());
        assertEquals("K64", sv.getMalop());
        assertEquals("CNTT", sv.getTenlop());
        assertEquals("123456", sv.getMasv());

        List<SinhVien> list = Arrays.asList(sv, new SinhVien("2", "Tran Thi B", "K64", "CNTT", "654321"));
        assertEquals(sv, service.getSinhVienById(list, "1"));
        assertNull(service.getSinhVienById(list, "3"));

        service.updateSinhVien(sv, "Nguyen Van B", "K65", "KHMT", "987654");
        assertEquals("Nguyen Van B", sv.getHoten());
        assertEquals("K65", sv.getMalop());
        assertEquals("KHMT", sv.getTenlop());
        assertEquals("987654", sv.getMasv());
    }
}
