import whisper 
model = whisper.load_model("medium")

audio = "audio/audio.mp3"
transcribe = model.transcribe(audio)
translate = model.transcribe(audio, task="translate")

print(transcribe["text"])

print("")

print(translate["text"])
