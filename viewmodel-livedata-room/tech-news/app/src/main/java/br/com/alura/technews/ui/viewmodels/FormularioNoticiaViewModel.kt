package br.com.alura.technews.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import br.com.alura.technews.model.Noticia
import br.com.alura.technews.repository.NoticiaRepository
import br.com.alura.technews.repository.Resource

class FormularioNoticiaViewModel(
    private val noticiaRepository: NoticiaRepository
) : ViewModel() {
    fun salva(noticia: Noticia): LiveData<Resource<Void?>> {
        return if (noticia.id > 0) {
            noticiaRepository.edita(noticia)
        } else {
            noticiaRepository.salva(
                noticia
            )
        }
    }

    fun buscaPorId(noticiaId: Long) = noticiaRepository.buscaPorId(noticiaId)
}