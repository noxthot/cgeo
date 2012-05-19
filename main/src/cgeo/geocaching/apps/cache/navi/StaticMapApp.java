package cgeo.geocaching.apps.cache.navi;

import cgeo.geocaching.R;
import cgeo.geocaching.cgCache;
import cgeo.geocaching.cgWaypoint;
import cgeo.geocaching.geopoint.Geopoint;

import android.app.Activity;

class StaticMapApp extends AbstractStaticMapsApp {

    StaticMapApp() {
        super(getString(R.string.cache_menu_map_static));
    }

    @Override
    public boolean invoke(Activity activity, cgCache cache, cgWaypoint waypoint, final Geopoint coords) {
        return invoke(activity, cache, waypoint, false);
    }

    @Override
    public boolean isEnabled(cgCache cache) {
        if (cache == null) {
            return false;
        }
        return hasStaticMap(cache);
    }

    @Override
    public boolean isEnabled(cgWaypoint waypoint) {
        if (waypoint == null) {
            return false;
        }
        return hasStaticMap(waypoint);
    }
}
