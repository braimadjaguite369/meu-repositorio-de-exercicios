public interface IPpod {
    public void addFile(File file) throws Exception;
    public void deleteFile(int index) throws Exception;
    public void playTrack(int index);
    public void nextTrack();
    public void previousTrack();
}
