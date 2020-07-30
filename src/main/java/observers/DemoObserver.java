package observers;

import com.codingsaint.learning.rxjava.utils.LoggerUtil;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class DemoObserver implements Observer {

    private Long id;

    public DemoObserver(Long id) {
        this.id = id;
    }

    @Override
    public void onSubscribe(Disposable dspsbl) {
        LoggerUtil.info("Observer " + id + " - onSubscribe");
    }

    @Override
    public void onNext(Object t) {
        LoggerUtil.info("Observer " + id + " - onNext -> {}", t);
    }

    @Override
    public void onError(Throwable thrwbl) {
        LoggerUtil.info("Observer " + id + " - onError -> {}" + thrwbl.getMessage());
    }

    @Override
    public void onComplete() {
        LoggerUtil.info("Observer " + id + " - onComplete");
    }
}
