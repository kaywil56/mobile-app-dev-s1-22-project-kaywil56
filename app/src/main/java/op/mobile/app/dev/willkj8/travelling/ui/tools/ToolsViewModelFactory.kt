package op.mobile.app.dev.willkj8.travelling.ui.tools

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import op.mobile.app.dev.willkj8.travelling.model.Country

/**
 * A view model factory class for tools.
 *
 * This class instantiates the tools view model.
 *
 * @param country The selected country object.
 */
class ToolsViewModelFactory(
    private val country: Country
    ) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(ToolsViewModel::class.java))
                return ToolsViewModel(country) as T
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
