package chp9;

import PackagesInterfaces.A;

/**
 * Created by bobsira on 6/13/17.
 * B implements the nested interface.
 */
public class B implements A.NestedIF {
    @Override
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
