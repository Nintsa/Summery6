package com.example.summery6

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.summery6.databinding.FragmentHomePageBinding

class HomePageFragment : Fragment() {
    private lateinit var binding: FragmentHomePageBinding
    private val currentPasscode = "0934"
    private val enteredPasscode = mutableListOf<String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomePageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getEnteredPasscode()
    }

    private fun getEnteredPasscode() {
        val allNumbers = listOf(
            binding.one,
            binding.two,
            binding.three,
            binding.four,
            binding.five,
            binding.six,
            binding.seven,
            binding.eight,
            binding.nine,
            binding.zero
        )

        for (button in allNumbers) {
            button.setOnClickListener {
                val pressedNumber = button.text.toString()
                updateEnteredPasscode(pressedNumber)
            }
        }
    }

    private fun updateEnteredPasscode(pressedNumber: String) {
        enteredPasscode.add(pressedNumber)

        if (enteredPasscode.size == 4) {
            checkPasscode()
        }
    }

    private fun checkPasscode() {
        val finalPasscode = enteredPasscode.joinToString("")
        if (finalPasscode == currentPasscode) {
            Toast.makeText(requireContext(), "Great Job", Toast.LENGTH_SHORT).show()
        } else {
            resetPressedNumbers()
            Toast.makeText(
                requireContext(),
                "Please try again.",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun resetPressedNumbers() {
        enteredPasscode.clear()
    }
}
