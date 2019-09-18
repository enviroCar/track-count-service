package org.envirocar.trackcount;

import org.envirocar.trackcount.model.Track;

public interface TrackDensifier {

    Track densify(Track track);

    Track densify(Track track, int numPoints);
}
