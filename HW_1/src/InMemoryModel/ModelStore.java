package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;
import ModelElements.Texture;

public class ModelStore implements iModelChanger {

    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private iModelChangeObserver[] changeObservers;

    public ModelStore(iModelChangeObserver[] changeObservers) throws Exception {
        this.changeObservers = changeObservers;

        this.models = new ArrayList<PoligonalModel>();
        this.scenes = new ArrayList<Scene>();
        this.flashes = new ArrayList<Flash>();
        this.cameras = new ArrayList<Camera>();

        /* добавляем по одному элементу списков (смотрим на мощность связи: 1..*) */

        List<Texture> Textures = new ArrayList<>();
        models.add(new PoligonalModel(Textures));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(0, models, flashes, cameras));
    }

    public Scene getScena(int id) {
        for (int i = 0; i < scenes.size(); i++) {
            if (scenes.get(i).id == id) {
                return scenes.get(i);
            }
        }
        return null;
    }

    @Override
    public void NotifyChange(iModelChanger sender) {
    }
}
