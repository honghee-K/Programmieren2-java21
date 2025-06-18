package Exercise.AK.Musik;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusikStueckSammlung {

    private Map<String, MusikStueck> map = new HashMap<>();
    // HashMap 추가(put)
    public void musikStueckEinfuegen(MusikStueck neu) {
        if (!map.containsKey(neu.getTitel())) {
            map.put(neu.getTitel(), neu);
        } else throw new IllegalArgumentException();
    }

    // List 정렬(sort)
    public List<MusikStueck> getAlleMusikStueckeNachTitel() {
        List<MusikStueck> musikList = new ArrayList<>(map.values()); // 해시맵 값을 리스트로 정렬하기
        musikList.sort(new VergleichMusikStueckTitel());
        return musikList;
    }

    public List<MusikStueck> getAlleMusikStueckNachLaenge() {
        List<MusikStueck> musikList = new ArrayList<>(map.values());
        musikList.sort(new VergleichMusikStueckLaenge());
        return musikList;
    }
}
