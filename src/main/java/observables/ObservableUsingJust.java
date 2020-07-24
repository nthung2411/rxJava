package observables;

import com.codingsaint.learning.rxjava.utils.LoggerUtil;
import io.reactivex.Observable;

public class ObservableUsingJust {

    public static void main(String... args) {
        Observable just = Observable.just(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .doOnNext(item -> LoggerUtil.info("onNext -> {}", item))
                .doAfterNext(item -> LoggerUtil.info("doAfterNext -> {}", item))
                .doOnComplete(() -> LoggerUtil.info("doOnComplete"));
        
        LoggerUtil.info("--------------------");
        just.subscribe(new DemoObserver(1L));
        LoggerUtil.info("--------------------");
        just.subscribe(new DemoObserver(2L));
    }
}
