package com.file;
import java.io.*;

import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.audio.mp3.MP3AudioHeader;
import org.jaudiotagger.audio.mp3.MP3File;

import javazoom.jl.player.Player;
import org.jaudiotagger.tag.TagException;

public class MusicUtil {

    public static void play(String position) {
        try {
            BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(position));
            Player player = new Player(buffer);
            player.play();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static int getDuration(String position) {

        int length = 0;
        try {

            MP3File mp3File = (MP3File) AudioFileIO.read(new File(position));
            MP3AudioHeader audioHeader = (MP3AudioHeader) mp3File.getAudioHeader();
            // 单位为秒
            length = audioHeader.getTrackLength();
            return length;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return length;
    }

    public static void main(String[] args) throws TagException, ReadOnlyFileException, CannotReadException, InvalidAudioFrameException, IOException {

        String position = "\\C:\\Users\\Administrator\\Desktop\\1.mp3";

        getDuration(position);
        play(position);

    }
}