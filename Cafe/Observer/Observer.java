package Observer;

import Lote.LoteCafe;

public interface Observer {
    void update(LoteCafe lote);
    String getId();
}
