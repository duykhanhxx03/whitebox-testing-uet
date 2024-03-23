import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class C2 {
    // Kiem thu voi do do C2
    @Test
    void test1() {
        assertEquals(HoaDon.phanTramGiamGia(-5,5000000), -1);
    }

    @Test
    void test2() {
        assertEquals(HoaDon.phanTramGiamGia(6,1000000), 100);
    }

    @Test
    void test3() {
        assertEquals(HoaDon.phanTramGiamGia(7,7500000), 10);
    }

    @Test
    void test4() {
        assertEquals(HoaDon.phanTramGiamGia(25,2000000), 5);
    }

    @Test
    void test5() {
        assertEquals(HoaDon.phanTramGiamGia(25,750000), 0);
    }

}