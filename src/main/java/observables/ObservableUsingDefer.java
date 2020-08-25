package observables;

import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import observers.DemoObserver;

public class ObservableUsingDefer {

    public static void main(String... args) {
        Observable<Integer> observableUsingDefer = Observable.defer(() -> {
            return Observable.fromIterable(RxUtils.postiveNumbers(5));
        });

        DemoObserver observer1 = new DemoObserver(1L);
        
        observableUsingDefer.subscribe(observer1);
        
        observableUsingDefer.subscribe(new DemoObserver(2L));        
        
        observableUsingDefer.subscribe(observer1);
    }
}
