package _03_Advanced._03_Serialization;

import java.io.Serializable;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Editor implements Serializable {
    
    public static final long serialVersionUID = 1L;
    public String language;
    public String encoding;
    public String fontSize;
    public String fontfamily;
    public boolean autoSave;
    public boolean autoComplete;
    public transient String direction;
    
}
