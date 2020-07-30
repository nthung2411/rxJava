package observables;

import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import observers.DemoObserver;

public class ObservableUsingDefer {

    public static void main(String... args) {
        Observable<Integer> observableUsingDefer = Observable.defer(() -> {
            return Observable.fromIterable(RxUtils.postiveNumbers(5));
        });

        observableUsingDefer.subscribe(new DemoObserver(1L));
        
        observableUsingDefer.subscribe(new DemoObserver(2L));
    }
}
